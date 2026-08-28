import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dnq extends dfa {
   public static final MapCodec<dnq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dnq::new)
   );
   public static final dsu b = dst.w;
   public static final dsu c = dst.a;
   public static final dsu d = dst.d;
   public static final dsu e = dko.b;
   public static final dsu f = dko.c;
   public static final dsu g = dko.d;
   public static final dsu h = dko.e;
   private static final Map<je, dsu> k = dgw.f;
   protected static final ewl i = dfa.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ewl j = dfa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dfa m;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dfa $$0, dsc.d $$1) {
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
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dsd a(cyb $$0) {
      dbf $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), je.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), je.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), je.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), je.e)));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$0.B && !$$3.eX().e() && $$3.eX().a(cut.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dww.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dbz $$0, iz $$1, dsd $$2) {
      for (je $$3 : new je[]{je.d, je.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iz $$5 = $$1.a($$3, $$4);
            dsd $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dnr.b) == $$3.g()) {
                  dnr.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dbz $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bsv> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bsv $$6 : $$5) {
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

   public boolean a(dsd $$0, je $$1) {
      return $$0.a(this.m) ? $$0.c(dnr.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
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
   protected dsd a(dsd $$0, djx $$1) {
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
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
