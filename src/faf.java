import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class faf extends fam {
   public static final axr<eqt> a = axn.l;
   public static final je<exw> b = exx.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<faf> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axr.a(mg.bd).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  exw.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, faf::new)
   );
   private final axr<eqt> h;
   private final je<exw> i;
   private final byte j;
   private final int k;
   private final boolean l;

   faf(List<fci> $$0, axr<eqt> $$1, je<exw> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public fao<faf> b() {
      return fap.q;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.f);
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if (!$$0.a(czc.vo)) {
         return $$0;
      } else {
         fei $$2 = $$1.c(fbt.f);
         if ($$2 != null) {
            arq $$3 = $$1.d();
            iu $$4 = $$3.a(this.h, iu.a((jo)$$2), this.k, this.l);
            if ($$4 != null) {
               cyy $$5 = czl.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               czl.a($$3, $$5);
               eyb.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static faf.a c() {
      return new faf.a();
   }

   public static class a extends fam.a<faf.a> {
      private axr<eqt> a;
      private je<exw> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = faf.a;
         this.b = faf.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected faf.a a() {
         return this;
      }

      public faf.a a(axr<eqt> $$0) {
         this.a = $$0;
         return this;
      }

      public faf.a a(je<exw> $$0) {
         this.b = $$0;
         return this;
      }

      public faf.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public faf.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public faf.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public fan b() {
         return new faf(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
