import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.util.List;
import java.util.SequencedSet;

public record dbw(boolean d, SequencedSet<ki<?>> e) {
   private static final Codec<SequencedSet<ki<?>>> f = ki.a.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
   public static final Codec<dbw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("hide_tooltip", false).forGetter(dbw::a),
               f.optionalFieldOf("hidden_components", ReferenceSortedSets.emptySet()).forGetter(dbw::b)
            )
            .apply($$0, dbw::new)
   );
   public static final yu<wh, dbw> b = yu.a(ys.b, dbw::a, ki.b.a(ys.a(ReferenceLinkedOpenHashSet::new)), dbw::b, dbw::new);
   public static final dbw c = new dbw(false, ReferenceSortedSets.emptySet());

   public dbw a(ki<?> $$0, boolean $$1) {
      if (this.e.contains($$0) == $$1) {
         return this;
      } else {
         SequencedSet<ki<?>> $$2 = new ReferenceLinkedOpenHashSet(this.e);
         if ($$1) {
            $$2.add($$0);
         } else {
            $$2.remove($$0);
         }

         return new dbw(this.d, $$2);
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
