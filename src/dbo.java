import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dbo extends ctc {
   public static final MapCodec<dbo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jb.f.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dbo::new)
   );
   public static final dfu b = dft.w;
   public static final dfu c = dft.a;
   public static final dfu d = dft.d;
   public static final dfu e = cyo.b;
   public static final dfu f = cyo.c;
   public static final dfu g = cyo.d;
   public static final dfu h = cyo.e;
   private static final Map<ha, dfu> k = cuw.f;
   protected static final eia i = ctc.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final eia j = ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final ctc m;

   @Override
   public MapCodec<dbo> a() {
      return a;
   }

   public dbo(ctc $$0, dfc.d $$1) {
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
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dfd a(clt $$0) {
      cph $$1 = $$0.q();
      gw $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ha.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ha.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ha.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ha.e)));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      if (!$$0.B && !$$3.eS().b() && $$3.eS().a(cjo.rg)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, djn.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cqb $$0, gw $$1, dfd $$2) {
      for (ha $$3 : new ha[]{ha.d, ha.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            gw $$5 = $$1.a($$3, $$4);
            dfd $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dbp.b) == $$3.g()) {
                  dbp.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(cqb $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends biw> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (biw $$6 : $$5) {
            if (!$$6.p_()) {
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
         $$0.a(new gw($$1), this, 10);
      }
   }

   public boolean a(dfd $$0, ha $$1) {
      return $$0.a(this.m) ? $$0.c(dbp.b) == $$1.g() : $$0.a(this);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
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
   public dfd a(dfd $$0, cxx $$1) {
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
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
