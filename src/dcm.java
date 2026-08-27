import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dcm extends cua {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dcm::new)
   );
   public static final dgs b = dgr.w;
   public static final dgs c = dgr.a;
   public static final dgs d = dgr.d;
   public static final dgs e = czm.b;
   public static final dgs f = czm.c;
   public static final dgs g = czm.d;
   public static final dgs h = czm.e;
   private static final Map<hx, dgs> k = cvu.f;
   protected static final eiy i = cua.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final eiy j = cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final cua m;

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public dcm(cua $$0, dga.d $$1) {
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
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dgb a(cmr $$0) {
      cqf $$1 = $$0.q();
      ht $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), hx.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), hx.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), hx.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), hx.e)));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      if (!$$0.B && !$$3.eS().b() && $$3.eS().a(ckm.rg)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dkl.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cqz $$0, ht $$1, dgb $$2) {
      for (hx $$3 : new hx[]{hx.d, hx.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            ht $$5 = $$1.a($$3, $$4);
            dgb $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dcn.b) == $$3.g()) {
                  dcn.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(cqz $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends bjt> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bjt $$6 : $$5) {
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

   public boolean a(dgb $$0, hx $$1) {
      return $$0.a(this.m) ? $$0.c(dcn.b) == $$1.g() : $$0.a(this);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
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
   public dgb a(dgb $$0, cyv $$1) {
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
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
