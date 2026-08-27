import com.mojang.serialization.MapCodec;

public class dan extends cua implements daz {
   public static final MapCodec<dan> a = b(dan::new);
   private static final int f = 1;
   private static final eiy g;
   private static final eiy h;
   private static final eiy i = cua.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eiy j = eiv.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dhb c = dgr.aW;
   public static final dgs d = dgr.C;
   public static final dgs e = dgr.b;

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   protected dan(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return eiv.b();
      }
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2) {
      return eiv.b();
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dgb a(cmr $$0) {
      ht $$1 = $$0.a();
      cqz $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == ebf.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      int $$4 = a($$1, $$2);
      dgb $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            bzp.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if ($$3.a(eiv.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : eiv.a();
      }
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(d) ? ebf.c.a(false) : super.c_($$0);
   }

   private boolean a(cqf $$0, ht $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cqf $$0, ht $$1) {
      ht.a $$2 = $$1.j().c(hx.a);
      dgb $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cuc.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, hx.b)) {
         return 0;
      }

      for (hx $$5 : hx.c.a) {
         dgb $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cuc.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eiy $$0 = cua.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eiy $$1 = cua.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eiy $$2 = cua.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eiy $$3 = cua.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eiy $$4 = cua.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = eiv.a($$0, $$1, $$2, $$3, $$4);
      eiy $$5 = cua.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eiy $$6 = cua.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eiy $$7 = cua.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eiy $$8 = cua.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = eiv.a(dan.i, g, $$6, $$5, $$8, $$7);
   }
}
