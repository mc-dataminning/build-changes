import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.util.List;
import java.util.SequencedSet;

public record dco(boolean d, SequencedSet<kj<?>> e) {
   private static final Codec<SequencedSet<kj<?>>> f = kj.a.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
   public static final Codec<dco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("hide_tooltip", false).forGetter(dco::a),
               f.optionalFieldOf("hidden_components", ReferenceSortedSets.emptySet()).forGetter(dco::b)
            )
            .apply($$0, dco::new)
   );
   public static final yw<wj, dco> b = yw.a(yu.b, dco::a, kj.b.a(yu.a(ReferenceLinkedOpenHashSet::new)), dco::b, dco::new);
   public static final dco c = new dco(false, ReferenceSortedSets.emptySet());

   public dco a(kj<?> $$0, boolean $$1) {
      if (this.e.contains($$0) == $$1) {
         return this;
      } else {
         SequencedSet<kj<?>> $$2 = new ReferenceLinkedOpenHashSet(this.e);
         if ($$1) {
            $$2.add($$0);
         } else {
            $$2.remove($$0);
         }

         return new dco(this.d, $$2);
      }
   }

   public boolean a(kj<?> $$0) {
      return !this.d && !this.e.contains($$0);
   }

   public boolean a() {
      return this.d;
   }

   public SequencedSet<kj<?>> b() {
      return this.e;
   }
}
