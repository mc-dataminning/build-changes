import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dno extends dey {
   public static final MapCodec<dno> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dno::new)
   );
   public static final dss b = dsr.w;
   public static final dss c = dsr.a;
   public static final dss d = dsr.d;
   public static final dss e = dkm.b;
   public static final dss f = dkm.c;
   public static final dss g = dkm.d;
   public static final dss h = dkm.e;
   private static final Map<je, dss> k = dgu.f;
   protected static final ewj i = dey.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ewj j = dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dey m;

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dey $$0, dsa.d $$1) {
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
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dsb a(cxz $$0) {
      dbd $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), je.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), je.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), je.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), je.e)));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      if (!$$0.B && !$$3.eX().e() && $$3.eX().a(cur.rV)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dwu.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dbx $$0, iz $$1, dsb $$2) {
      for (je $$3 : new je[]{je.d, je.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iz $$5 = $$1.a($$3, $$4);
            dsb $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dnp.b) == $$3.g()) {
                  dnp.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dbx $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bst> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bst $$6 : $$5) {
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

   public boolean a(dsb $$0, je $$1) {
      return $$0.a(this.m) ? $$0.c(dnp.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
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
   protected dsb a(dsb $$0, djv $$1) {
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
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
