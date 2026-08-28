import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbn extends fbu {
   public static final axt<esb> a = axp.l;
   public static final jf<eze> b = ezf.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<fbn> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axt.a(mh.be).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eze.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, fbn::new)
   );
   private final axt<esb> h;
   private final jf<eze> i;
   private final byte j;
   private final int k;
   private final boolean l;

   fbn(List<fdq> $$0, axt<esb> $$1, jf<eze> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public fbw<fbn> b() {
      return fbx.q;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.f);
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if (!$$0.a(dac.vt)) {
         return $$0;
      } else {
         ffq $$2 = $$1.c(fdb.f);
         if ($$2 != null) {
            ars $$3 = $$1.d();
            iv $$4 = $$3.a(this.h, iv.a((jp)$$2), this.k, this.l);
            if ($$4 != null) {
               czy $$5 = dal.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               dal.a($$3, $$5);
               ezj.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static fbn.a c() {
      return new fbn.a();
   }

   public static class a extends fbu.a<fbn.a> {
      private axt<esb> a;
      private jf<eze> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = fbn.a;
         this.b = fbn.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected fbn.a a() {
         return this;
      }

      public fbn.a a(axt<esb> $$0) {
         this.a = $$0;
         return this;
      }

      public fbn.a a(jf<eze> $$0) {
         this.b = $$0;
         return this;
      }

      public fbn.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public fbn.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fbn.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public fbv b() {
         return new fbn(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
