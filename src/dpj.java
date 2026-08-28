import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpj extends dkr implements dnx {
   public static final MapCodec<dpj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dup.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dpj::new)
   );
   public static final dur b = duq.u;
   public static final duy<duz> c = duq.af;
   public static final dur d = duq.w;
   public static final dur e = duq.C;
   protected static final int f = 3;
   protected static final eyx g = dgv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eyx h = dgv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eyx i = dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eyx j = dgv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eyx k = dgv.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eyx l = dgv.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dup m;

   @Override
   public MapCodec<? extends dpj> a() {
      return a;
   }

   protected dpj(dup $$0, dtz.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.E.b().b(aE, jj.c).b(b, Boolean.valueOf(false)).b(c, duz.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == duz.a ? l : k;
      } else {
         switch ((jj)$$0.c(aE)) {
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
   protected boolean a(dua $$0, eqq $$1) {
      switch ($$1) {
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
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!this.m.c()) {
         return brk.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return brk.a;
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      if ($$3.f() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dua $$0, dds $$1, je $$2, @Nullable cnp $$3) {
      dua $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eqc.c, eqc.c.a((ddv)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cnp $$0, dds $$1, je $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awe.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dyx.h : dyx.d, $$2);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eqc.c, eqc.c.a((ddv)$$1));
            }
         }
      }
   }

   @Override
   public dua a(cyw $$0) {
      dua $$1 = this.o();
      eqb $$2 = $$0.q().b_($$0.a());
      jj $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aE, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? duz.a : duz.b);
      } else {
         $$1 = $$1.b(aE, $$0.g().g()).b(c, $$3 == jj.b ? duz.b : duz.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == eqc.c));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(e) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dup m() {
      return this.m;
   }
}
