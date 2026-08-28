import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dtb extends doj implements drp {
   public static final MapCodec<dtb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyj.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dtb::new)
   );
   public static final dyl b = dyk.v;
   public static final dyr<dys> c = dyk.ag;
   public static final dyl d = dyk.x;
   public static final dyl e = dyk.D;
   protected static final int f = 3;
   protected static final fcr g = dkl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fcr h = dkl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcr i = dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcr j = dkl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fcr k = dkl.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fcr l = dkl.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dyj m;

   @Override
   public MapCodec<? extends dtb> a() {
      return a;
   }

   protected dtb(dyj $$0, dxt.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(c, dys.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dys.a ? l : k;
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
   protected boolean a(dxu $$0, eul $$1) {
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
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!this.m.c()) {
         return bti.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bti.a;
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, dgz $$3, BiConsumer<cxo, jh> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dxu $$0, dhh $$1, jh $$2, @Nullable cpw $$3) {
      dxu $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, etx.c, etx.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cpw $$0, dhh $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ecq.h : ecq.d, $$2);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, etx.c, etx.c.a($$1));
            }
         }
      }
   }

   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = this.m();
      etw $$2 = $$0.q().b_($$0.a());
      jm $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dys.a : dys.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jm.b ? dys.b : dys.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == etx.c));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dyj q() {
      return this.m;
   }
}
