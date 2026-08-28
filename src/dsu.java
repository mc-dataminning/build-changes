import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dsu extends doc implements dri {
   public static final MapCodec<dsu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyc.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dsu::new)
   );
   public static final dye b = dyd.v;
   public static final dyk<dyl> c = dyd.ag;
   public static final dye d = dyd.x;
   public static final dye e = dyd.D;
   protected static final int f = 3;
   protected static final fcm g = dke.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fcm h = dke.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcm i = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcm j = dke.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fcm k = dke.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fcm l = dke.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dyc m;

   @Override
   public MapCodec<? extends dsu> a() {
      return a;
   }

   protected dsu(dyc $$0, dxm.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(c, dyl.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dyl.a ? l : k;
      } else {
         switch ((jm)$$0.c(aF)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!this.m.c()) {
         return bte.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bte.a;
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, dgs $$3, BiConsumer<cxk, jh> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dxn $$0, dha $$1, jh $$2, @Nullable cps $$3) {
      dxn $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, etq.c, etq.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cps $$0, dha $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ecj.h : ecj.d, $$2);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, etq.c, etq.c.a($$1));
            }
         }
      }
   }

   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = this.m();
      etp $$2 = $$0.q().b_($$0.a());
      jm $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dyl.a : dyl.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jm.b ? dyl.b : dyl.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == etq.c));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(e) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dyc q() {
      return this.m;
   }
}
