import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dwj extends dne {
   public static final MapCodec<dwj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("hook").forGetter($$0x -> $$0x.T), t()).apply($$0, dwj::new)
   );
   public static final ebx b = ebw.A;
   public static final ebx c = ebw.a;
   public static final ebx d = ebw.g;
   public static final ebx e = dsy.b;
   public static final ebx f = dsy.c;
   public static final ebx g = dsy.d;
   public static final ebx h = dsy.e;
   private static final Map<jc, ebx> i = dpc.f;
   private static final fgm D = dne.b(16.0, 1.0, 2.5);
   private static final fgm R = dne.b(16.0, 0.0, 8.0);
   private static final int S = 10;
   private final dne T;

   @Override
   public MapCodec<dwj> a() {
      return a;
   }

   public dwj(dne $$0, ebf.d $$1) {
      super($$1);
      this.l(
         this.C
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.T = $$0;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$0.c(c) ? D : R;
   }

   @Override
   public ebg a(ddt $$0) {
      djd $$1 = $$0.q();
      iw $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jc.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jc.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jc.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jc.e)));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      if (!$$0.C && !$$3.fb().f() && $$3.fb().a(dae.td)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, egg.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(djz $$0, iw $$1, ebg $$2) {
      for (jc $$3 : new jc[]{jc.d, jc.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            iw $$5 = $$1.a($$3, $$4);
            ebg $$6 = $$0.a_($$5);
            if ($$6.a(this.T)) {
               if ($$6.c(dwk.b) == $$3.g()) {
                  dwk.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fgm a(ebg $$0, djd $$1, iw $$2, bwv $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(djz $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      List<? extends bwv> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(djz $$0, iw $$1, List<? extends bwv> $$2) {
      ebg $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bwv $$6 : $$2) {
            if (!$$6.g_()) {
               $$5 = true;
               break;
            }
         }
      }

      if ($$5 != $$4) {
         $$3 = $$3.b(b, Boolean.valueOf($$5));
         $$0.a($$1, $$3, 3);
         this.a($$0, $$1, $$3);
      }

      if ($$5) {
         $$0.a(new iw($$1), this, 10);
      }
   }

   public boolean a(ebg $$0, jc $$1) {
      return $$0.a(this.T) ? $$0.c(dwk.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      switch ($$1) {
         case c:
            return $$0.b(e, $$0.c(g)).b(f, $$0.c(h)).b(g, $$0.c(e)).b(h, $$0.c(f));
         case d:
            return $$0.b(e, $$0.c(f)).b(f, $$0.c(g)).b(g, $$0.c(h)).b(h, $$0.c(e));
         case b:
            return $$0.b(e, $$0.c(h)).b(f, $$0.c(e)).b(g, $$0.c(f)).b(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      switch ($$1) {
         case b:
            return $$0.b(e, $$0.c(g)).b(g, $$0.c(e));
         case c:
            return $$0.b(f, $$0.c(h)).b(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
