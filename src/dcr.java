import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.util.List;
import java.util.SequencedSet;

public record dcr(boolean d, SequencedSet<kj<?>> e) {
   private static final Codec<SequencedSet<kj<?>>> f = kj.a.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
   public static final Codec<dcr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("hide_tooltip", false).forGetter(dcr::a),
               f.optionalFieldOf("hidden_components", ReferenceSortedSets.emptySet()).forGetter(dcr::b)
            )
            .apply($$0, dcr::new)
   );
   public static final yw<wj, dcr> b = yw.a(yu.b, dcr::a, kj.b.a(yu.a(ReferenceLinkedOpenHashSet::new)), dcr::b, dcr::new);
   public static final dcr c = new dcr(false, ReferenceSortedSets.emptySet());

   public dcr a(kj<?> $$0, boolean $$1) {
      if (this.e.contains($$0) == $$1) {
         return this;
      } else {
         SequencedSet<kj<?>> $$2 = new ReferenceLinkedOpenHashSet(this.e);
         if ($$1) {
            $$2.add($$0);
         } else {
            $$2.remove($$0);
         }

         return new dcr(this.d, $$2);
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
