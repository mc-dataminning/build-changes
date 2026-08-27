import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyi extends cwb {
   public static final MapCodec<cyi> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyf.a.forGetter($$0x -> $$0x.f), u()).apply($$0, cyi::new));
   private final cwq f;

   @Override
   public MapCodec<cyi> a() {
      return e;
   }

   protected cyi(cwq $$0, djg.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      this.a($$0, (ctq)$$1, $$2);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cws.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ees.c, ees.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
