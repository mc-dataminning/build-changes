import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.util.List;
import java.util.SequencedSet;

public record dcc(boolean d, SequencedSet<ki<?>> e) {
   private static final Codec<SequencedSet<ki<?>>> f = ki.a.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
   public static final Codec<dcc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("hide_tooltip", false).forGetter(dcc::a),
               f.optionalFieldOf("hidden_components", ReferenceSortedSets.emptySet()).forGetter(dcc::b)
            )
            .apply($$0, dcc::new)
   );
   public static final yw<wj, dcc> b = yw.a(yu.b, dcc::a, ki.b.a(yu.a(ReferenceLinkedOpenHashSet::new)), dcc::b, dcc::new);
   public static final dcc c = new dcc(false, ReferenceSortedSets.emptySet());

   public dcc a(ki<?> $$0, boolean $$1) {
      if (this.e.contains($$0) == $$1) {
         return this;
      } else {
         SequencedSet<ki<?>> $$2 = new ReferenceLinkedOpenHashSet(this.e);
         if ($$1) {
            $$2.add($$0);
         } else {
            $$2.remove($$0);
         }

         return new dcc(this.d, $$2);
      }
   }

   public boolean a(ki<?> $$0) {
      return !this.d && !this.e.contains($$0);
   }

   public boolean a() {
      return this.d;
   }

   public SequencedSet<ki<?>> b() {
      return this.e;
   }
}
