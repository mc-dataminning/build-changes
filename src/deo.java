import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class deo extends cvz {
   public static final MapCodec<deo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, deo::new)
   );
   public static final djg b = djf.w;
   public static final djg c = djf.a;
   public static final djg d = djf.d;
   public static final djg e = dbm.b;
   public static final djg f = dbm.c;
   public static final djg g = dbm.d;
   public static final djg h = dbm.e;
   private static final Map<ia, djg> k = cxv.f;
   protected static final elu i = cvz.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final elu j = cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final cvz m;

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public deo(cvz $$0, dio.d $$1) {
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
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dip a(coq $$0) {
      cse $$1 = $$0.q();
      hv $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ia.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ia.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ia.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ia.e)));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      if (!$$0.B && !$$3.eT().b() && $$3.eT().a(cmk.rS)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dmz.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(csy $$0, hv $$1, dip $$2) {
      for (ia $$3 : new ia[]{ia.d, ia.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            hv $$5 = $$1.a($$3, $$4);
            dip $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dep.b) == $$3.g()) {
                  dep.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(csy $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends blf> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (blf $$6 : $$5) {
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
         $$0.a(new hv($$1), this, 10);
      }
   }

   public boolean a(dip $$0, ia $$1) {
      return $$0.a(this.m) ? $$0.c(dep.b) == $$1.g() : $$0.a(this);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
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
   public dip a(dip $$0, dav $$1) {
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
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
