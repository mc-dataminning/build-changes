import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dhh extends cys {
   public static final MapCodec<dhh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dhh::new)
   );
   public static final dma b = dlz.w;
   public static final dma c = dlz.a;
   public static final dma d = dlz.d;
   public static final dma e = def.b;
   public static final dma f = def.c;
   public static final dma g = def.d;
   public static final dma h = def.e;
   private static final Map<ie, dma> k = dao.f;
   protected static final eos i = cys.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final eos j = cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final cys m;

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhh(cys $$0, dli.d $$1) {
      super($$1);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(h, Boolean.valueOf(false))
      );
      this.m = $$0;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dlj a(crk $$0) {
      cux $$1 = $$0.q();
      hz $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ie.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ie.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ie.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ie.e)));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      if (!$$0.B && !$$3.eT().b() && $$3.eT().a(cpg.rU)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dpw.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cvr $$0, hz $$1, dlj $$2) {
      for (ie $$3 : new ie[]{ie.d, ie.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            hz $$5 = $$1.a($$3, $$4);
            dlj $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dhi.b) == $$3.g()) {
                  dhi.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(cvr $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bnq> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bnq $$6 : $$5) {
            if (!$$6.r_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.a(b, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new hz($$1), this, 10);
      }
   }

   public boolean a(dlj $$0, ie $$1) {
      return $$0.a(this.m) ? $$0.c(dhi.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      switch ($$1) {
         case c:
            return $$0.a(e, $$0.c(g)).a(f, $$0.c(h)).a(g, $$0.c(e)).a(h, $$0.c(f));
         case d:
            return $$0.a(e, $$0.c(f)).a(f, $$0.c(g)).a(g, $$0.c(h)).a(h, $$0.c(e));
         case b:
            return $$0.a(e, $$0.c(h)).a(f, $$0.c(e)).a(g, $$0.c(f)).a(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      switch ($$1) {
         case b:
            return $$0.a(e, $$0.c(g)).a(g, $$0.c(e));
         case c:
            return $$0.a(f, $$0.c(h)).a(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
