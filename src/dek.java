import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dek extends dgu {
   public static final MapCodec<dek> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               drs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dek::new)
   );
   public static final dru b = drt.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final evf e = dea.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final evf f = dea.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final evf g = dea.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final evf h = dea.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final evf i = dea.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final evf j = dea.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final evf k = dea.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final evf l = dea.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final evf m = dea.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final evf n = dea.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final evf o = dea.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final evf F = dea.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final evf G = dea.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final evf H = dea.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final evf I = dea.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final evf J = dea.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final drs N;
   private final int O;

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   protected dek(drs $$0, int $$1, drc.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, it.c).a(b, Boolean.valueOf(false)).a(K, dro.b));
      this.O = $$1;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      it $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dro)$$0.c(K)) {
         case a:
            if ($$4.o() == it.a.a) {
               return $$5 ? o : g;
            }

            return $$5 ? F : h;
         case b:
            return switch ($$4) {
               case f -> $$5 ? J : l;
               case e -> $$5 ? I : k;
               case d -> $$5 ? H : j;
               case c, b, a -> $$5 ? G : i;
            };
         case c:
         default:
            if ($$4.o() == it.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$0.c(b)) {
         return bpw.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dvw.a, $$2);
         return bpw.a($$1.B);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dar $$3, BiConsumer<ctq, io> $$4) {
      if ($$3.j() == dar.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(drd $$0, daz $$1, io $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cly $$0, dba $$1, io $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avj.e);
   }

   protected avh a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(drd $$0, daz $$1, io $$2) {
      cme $$3 = this.N.e() ? $$1.a(cme.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dvw.a : dvw.e, $$2);
      }

      if ($$4) {
         $$1.a(new io($$2), this, this.O);
      }
   }

   private void f(drd $$0, daz $$1, io $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(aE, b, K);
   }
}
