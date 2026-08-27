import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dim extends ddv implements dha {
   public static final MapCodec<dim> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dno.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dim::new)
   );
   public static final dnq b = dnp.u;
   public static final dnx<dny> c = dnp.af;
   public static final dnq d = dnp.w;
   public static final dnq e = dnp.C;
   protected static final int f = 3;
   protected static final eqk g = daa.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eqk h = daa.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqk i = daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eqk j = daa.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eqk k = daa.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eqk l = daa.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dno m;

   @Override
   public MapCodec<? extends dim> a() {
      return a;
   }

   protected dim(dno $$0, dmy.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(c, dny.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dny.a ? l : k;
      } else {
         switch ((ih)$$0.c(aE)) {
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
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
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
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if (!this.m.c()) {
         return bnc.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bnc.a($$1.B);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cwr $$3, BiConsumer<cqk, ib> $$4) {
      if ($$3.j() == cwr.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dmz $$0, cwz $$1, ib $$2, @Nullable cis $$3) {
      dmz $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eio.c, eio.c.a((cxc)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cis $$0, cwz $$1, ib $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? drn.h : drn.d, $$2);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eio.c, eio.c.a((cxc)$$1));
            }
         }
      }
   }

   @Override
   public dmz a(css $$0) {
      dmz $$1 = this.o();
      ein $$2 = $$0.q().b_($$0.a());
      ih $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dny.a : dny.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ih.b ? dny.b : dny.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eio.c));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(e) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dno i() {
      return this.m;
   }
}
