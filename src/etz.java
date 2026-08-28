import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etz extends eug {
   public static final axi<eko> a = axe.l;
   public static final jn<erq> b = err.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<etz> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axi.a(lv.aR).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  erq.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, etz::new)
   );
   private final axi<eko> h;
   private final jn<erq> i;
   private final byte j;
   private final int k;
   private final boolean l;

   etz(List<ewe> $$0, axi<eko> $$1, jn<erq> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eui<etz> b() {
      return euj.q;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.f);
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if (!$$0.a(cvo.ul)) {
         return $$0;
      } else {
         eye $$2 = $$1.c(evp.f);
         if ($$2 != null) {
            arg $$3 = $$1.d();
            je $$4 = $$3.a(this.h, je.a((jx)$$2), this.k, this.l);
            if ($$4 != null) {
               cvl $$5 = cvx.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cvx.a($$3, $$5);
               erv.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static etz.a c() {
      return new etz.a();
   }

   public static class a extends eug.a<etz.a> {
      private axi<eko> a;
      private jn<erq> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = etz.a;
         this.b = etz.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected etz.a a() {
         return this;
      }

      public etz.a a(axi<eko> $$0) {
         this.a = $$0;
         return this;
      }

      public etz.a a(jn<erq> $$0) {
         this.b = $$0;
         return this;
      }

      public etz.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public etz.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public etz.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public euh b() {
         return new etz(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
