import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.util.List;
import java.util.SequencedSet;

public record ddo(boolean d, SequencedSet<kk<?>> e) {
   private static final Codec<SequencedSet<kk<?>>> f = kk.a.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
   public static final Codec<ddo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("hide_tooltip", false).forGetter(ddo::a),
               f.optionalFieldOf("hidden_components", ReferenceSortedSets.emptySet()).forGetter(ddo::b)
            )
            .apply($$0, ddo::new)
   );
   public static final ze<wp, ddo> b = ze.a(zc.b, ddo::a, kk.b.a(zc.a(ReferenceLinkedOpenHashSet::new)), ddo::b, ddo::new);
   public static final ddo c = new ddo(false, ReferenceSortedSets.emptySet());

   public ddo a(kk<?> $$0, boolean $$1) {
      if (this.e.contains($$0) == $$1) {
         return this;
      } else {
         SequencedSet<kk<?>> $$2 = new ReferenceLinkedOpenHashSet(this.e);
         if ($$1) {
            $$2.add($$0);
         } else {
            $$2.remove($$0);
         }

         return new ddo(this.d, $$2);
      }
   }

   public boolean a(kk<?> $$0) {
      return !this.d && !this.e.contains($$0);
   }

   public boolean a() {
      return this.d;
   }

   public SequencedSet<kk<?>> b() {
      return this.e;
   }
}
