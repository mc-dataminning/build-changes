import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cq extends cx<cq.a> {
   @Override
   public Codec<cq.a> a() {
      return cq.a.a;
   }

   public void a(apb $$0, bof $$1, bne $$2, float $$3, float $$4, boolean $$5) {
      ejy $$6 = br.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bc> b, Optional<bf> c, Optional<bc> d) implements cx.a {
      public static final Codec<cq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.a(br.b, "player").forGetter(cq.a::a), avu.a(bf.a, "damage").forGetter(cq.a::c), avu.a(br.b, "entity").forGetter(cq.a::d))
               .apply($$0, cq.a::new)
      );

      public static an<cq.a> b() {
         return am.h.a(new cq.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cq.a> a(Optional<bf> $$0) {
         return am.h.a(new cq.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static an<cq.a> a(bf.a $$0) {
         return am.h.a(new cq.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static an<cq.a> b(Optional<br> $$0) {
         return am.h.a(new cq.a(Optional.empty(), Optional.empty(), br.a($$0)));
      }

      public static an<cq.a> a(Optional<bf> $$0, Optional<br> $$1) {
         return am.h.a(new cq.a(Optional.empty(), $$0, br.a($$1)));
      }

      public static an<cq.a> a(bf.a $$0, Optional<br> $$1) {
         return am.h.a(new cq.a(Optional.empty(), Optional.of($$0.b()), br.a($$1)));
      }

      public boolean a(apb $$0, ejy $$1, bne $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
