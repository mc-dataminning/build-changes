import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class del extends czu implements dcz {
   public static final MapCodec<del> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, del::new)
   );
   public static final djg b = djf.u;
   public static final djn<djo> c = djf.af;
   public static final djg d = djf.w;
   public static final djg e = djf.C;
   protected static final int f = 3;
   protected static final elu g = cvz.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final elu h = cvz.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final elu i = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final elu j = cvz.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final elu k = cvz.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final elu l = cvz.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dje m;

   @Override
   public MapCodec<? extends del> a() {
      return a;
   }

   protected del(dje $$0, dio.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ia.c).a(b, Boolean.valueOf(false)).a(c, djo.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == djo.a ? l : k;
      } else {
         switch ((ia)$$0.c(aE)) {
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
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
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
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if (!this.m.c()) {
         return bjl.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bjl.a($$1.B);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, csq $$3, BiConsumer<cmh, hv> $$4) {
      if ($$3.j() == csq.a.d && !$$1.y_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dip $$0, csy $$1, hv $$2, @Nullable cer $$3) {
      dip $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eea.c, eea.c.a((ctb)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cer $$0, csy $$1, hv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), ard.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dmz.h : dmz.d, $$2);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eea.c, eea.c.a((ctb)$$1));
            }
         }
      }
   }

   @Override
   public dip a(coq $$0) {
      dip $$1 = this.o();
      edz $$2 = $$0.q().b_($$0.a());
      ia $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? djo.a : djo.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ia.b ? djo.b : djo.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eea.c));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(e) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dje g() {
      return this.m;
   }
}
