import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class ddg extends cut {
   public static final MapCodec<ddg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, ddg::new)
   );
   public static final dhn b = dhm.w;
   public static final dhn c = dhm.a;
   public static final dhn d = dhm.d;
   public static final dhn e = dag.b;
   public static final dhn f = dag.c;
   public static final dhn g = dag.d;
   public static final dhn h = dag.e;
   private static final Map<hx, dhn> k = cwo.f;
   protected static final ekb i = cut.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ekb j = cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final cut m;

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(cut $$0, dgv.d $$1) {
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
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dgw a(cnj $$0) {
      cqy $$1 = $$0.q();
      ht $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), hx.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), hx.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), hx.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), hx.e)));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      if (!$$0.B && !$$3.eS().b() && $$3.eS().a(cle.rh)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dlg.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(crs $$0, ht $$1, dgw $$2) {
      for (hx $$3 : new hx[]{hx.d, hx.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ht $$5 = $$1.a($$3, $$4);
            dgw $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(ddh.b) == $$3.g()) {
                  ddh.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(crs $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bki> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bki $$6 : $$5) {
            if (!$$6.q_()) {
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
         $$0.a(new ht($$1), this, 10);
      }
   }

   public boolean a(dgw $$0, hx $$1) {
      return $$0.a(this.m) ? $$0.c(ddh.b) == $$1.g() : $$0.a(this);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
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
   public dgw a(dgw $$0, czp $$1) {
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
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
