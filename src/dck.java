import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dck extends cxu implements daz {
   public static final MapCodec<dck> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dck::new)
   );
   public static final dgs b = dgr.u;
   public static final dgz<dha> c = dgr.af;
   public static final dgs d = dgr.w;
   public static final dgs e = dgr.C;
   protected static final int f = 3;
   protected static final eiy g = cua.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eiy h = cua.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eiy i = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eiy j = cua.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eiy k = cua.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eiy l = cua.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dgq m;

   @Override
   public MapCodec<dck> a() {
      return a;
   }

   protected dck(dgq $$0, dga.d $$1) {
      super($$1.a($$0.f()));
      this.m = $$0;
      this.k(this.E.b().a(aE, hx.c).a(b, Boolean.valueOf(false)).a(c, dha.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dha.a ? l : k;
      } else {
         switch ((hx)$$0.c(aE)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if (!this.m.c()) {
         return bib.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 2);
         if ($$0.c(e)) {
            $$1.a($$2, ebf.c, ebf.c.a((crc)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(b));
         return bib.a($$1.B);
      }
   }

   protected void a(@Nullable ccx $$0, cqz $$1, ht $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.j() : this.m.i(), aqe.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dkl.h : dkl.d, $$2);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, ebf.c, ebf.c.a((crc)$$1));
            }
         }
      }
   }

   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = this.o();
      ebe $$2 = $$0.q().b_($$0.a());
      hx $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dha.a : dha.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == hx.b ? dha.b : dha.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == ebf.c));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(e) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
