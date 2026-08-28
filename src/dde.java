import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.util.List;
import java.util.SequencedSet;

public record dde(boolean d, SequencedSet<kk<?>> e) {
   private static final Codec<SequencedSet<kk<?>>> f = kk.a.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
   public static final Codec<dde> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("hide_tooltip", false).forGetter(dde::a),
               f.optionalFieldOf("hidden_components", ReferenceSortedSets.emptySet()).forGetter(dde::b)
            )
            .apply($$0, dde::new)
   );
   public static final za<wn, dde> b = za.a(yy.b, dde::a, kk.b.a(yy.a(ReferenceLinkedOpenHashSet::new)), dde::b, dde::new);
   public static final dde c = new dde(false, ReferenceSortedSets.emptySet());

   public dde a(kk<?> $$0, boolean $$1) {
      if (this.e.contains($$0) == $$1) {
         return this;
      } else {
         SequencedSet<kk<?>> $$2 = new ReferenceLinkedOpenHashSet(this.e);
         if ($$1) {
            $$2.add($$0);
         } else {
            $$2.remove($$0);
         }

         return new dde(this.d, $$2);
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
