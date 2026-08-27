import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dey extends cwj {
   public static final MapCodec<dey> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), u()).apply($$0, dey::new)
   );
   public static final djr b = djq.w;
   public static final djr c = djq.a;
   public static final djr d = djq.d;
   public static final djr e = dbw.b;
   public static final djr f = dbw.c;
   public static final djr g = dbw.d;
   public static final djr h = dbw.e;
   private static final Map<ic, djr> k = cyf.f;
   protected static final emf i = cwj.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final emf j = cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final cwj m;

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   public dey(cwj $$0, diz.d $$1) {
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
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dja a(cpa $$0) {
      cso $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o()
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.e()), ic.c)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.h()), ic.f)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), ic.d)))
         .a(h, Boolean.valueOf(this.a($$1.a_($$2.g()), ic.e)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1.o().d() ? $$0.a(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      if (!$$0.B && !$$3.eT().b() && $$3.eT().a(cmu.rS)) {
         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dnk.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cti $$0, hx $$1, dja $$2) {
      for (ic $$3 : new ic[]{ic.d, ic.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            hx $$5 = $$1.a($$3, $$4);
            dja $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dez.b) == $$3.g()) {
                  dez.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(cti $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends blp> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (blp $$6 : $$5) {
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
         $$0.a(new hx($$1), this, 10);
      }
   }

   public boolean a(dja $$0, ic $$1) {
      return $$0.a(this.m) ? $$0.c(dez.b) == $$1.g() : $$0.a(this);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
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
   public dja a(dja $$0, dbf $$1) {
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
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
