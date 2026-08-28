import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dnp extends dez {
   public static final MapCodec<dnp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dnp::new)
   );
   public static final dst b = dss.w;
   public static final dst c = dss.a;
   public static final dst d = dss.d;
   public static final dst e = dkn.b;
   public static final dst f = dkn.c;
   public static final dst g = dkn.d;
   public static final dst h = dkn.e;
   private static final Map<je, dst> k = dgv.f;
   protected static final ewk i = dez.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ewk j = dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dez m;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dez $$0, dsb.d $$1) {
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
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dsc a(cya $$0) {
      dbe $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), je.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), je.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), je.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), je.e)));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      if (!$$0.B && !$$3.eX().e() && $$3.eX().a(cus.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dwv.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dby $$0, iz $$1, dsc $$2) {
      for (je $$3 : new je[]{je.d, je.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iz $$5 = $$1.a($$3, $$4);
            dsc $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dnq.b) == $$3.g()) {
                  dnq.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dby $$0, iz $$1) {
      dsc $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bsu> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bsu $$6 : $$5) {
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
         $$0.a(new iz($$1), this, 10);
      }
   }

   public boolean a(dsc $$0, je $$1) {
      return $$0.a(this.m) ? $$0.c(dnq.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
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
   protected dsc a(dsc $$0, djw $$1) {
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
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
