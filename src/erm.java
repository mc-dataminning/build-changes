import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erm extends ert {
   public static final axe<eij> a = axa.l;
   public static final ji<epe> b = epf.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<erm> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.a(lq.aJ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  epe.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, erm::new)
   );
   private final axe<eij> h;
   private final ji<epe> i;
   private final byte j;
   private final int k;
   private final boolean l;

   erm(List<etr> $$0, axe<eij> $$1, ji<epe> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public erv<erm> b() {
      return erw.q;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.f);
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if (!$$0.a(cur.uj)) {
         return $$0;
      } else {
         evq $$2 = $$1.c(etd.f);
         if ($$2 != null) {
            are $$3 = $$1.d();
            iz $$4 = $$3.a(this.h, iz.a($$2), this.k, this.l);
            if ($$4 != null) {
               cuo $$5 = cuw.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cuw.a($$3, $$5);
               epj.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static erm.a c() {
      return new erm.a();
   }

   public static class a extends ert.a<erm.a> {
      private axe<eij> a;
      private ji<epe> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = erm.a;
         this.b = erm.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected erm.a a() {
         return this;
      }

      public erm.a a(axe<eij> $$0) {
         this.a = $$0;
         return this;
      }

      public erm.a a(ji<epe> $$0) {
         this.b = $$0;
         return this;
      }

      public erm.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public erm.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public erm.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eru b() {
         return new erm(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
