import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ezt extends faa {
   public static final axp<eqi> a = axl.l;
   public static final je<exk> b = exl.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<ezt> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axp.a(mg.bc).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  exk.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ezt::new)
   );
   private final axp<eqi> h;
   private final je<exk> i;
   private final byte j;
   private final int k;
   private final boolean l;

   ezt(List<fbw> $$0, axp<eqi> $$1, je<exk> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public fac<ezt> b() {
      return fad.q;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.f);
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if (!$$0.a(cyw.vm)) {
         return $$0;
      } else {
         fdw $$2 = $$1.c(fbh.f);
         if ($$2 != null) {
            aro $$3 = $$1.d();
            iu $$4 = $$3.a(this.h, iu.a((jo)$$2), this.k, this.l);
            if ($$4 != null) {
               cys $$5 = czf.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               czf.a($$3, $$5);
               exp.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ezt.a c() {
      return new ezt.a();
   }

   public static class a extends faa.a<ezt.a> {
      private axp<eqi> a;
      private je<exk> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ezt.a;
         this.b = ezt.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ezt.a a() {
         return this;
      }

      public ezt.a a(axp<eqi> $$0) {
         this.a = $$0;
         return this;
      }

      public ezt.a a(je<exk> $$0) {
         this.b = $$0;
         return this;
      }

      public ezt.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ezt.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ezt.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public fab b() {
         return new ezt(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
