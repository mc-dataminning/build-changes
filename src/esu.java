import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esu extends eta {
   public static final awt<ejt> a = awp.l;
   public static final ja<eqo> b = eqp.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<esu> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axu.a(awt.a(li.aJ), "destination", a).forGetter($$0x -> $$0x.h),
                  eqo.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  axu.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  axu.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  axu.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, esu::new)
   );
   private final awt<ejt> h;
   private final ja<eqo> i;
   private final byte j;
   private final int k;
   private final boolean l;

   esu(List<euu> $$0, awt<ejt> $$1, ja<eqo> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public etc b() {
      return etd.p;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(eug.f);
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      if (!$$0.a(cuk.vU)) {
         return $$0;
      } else {
         ewu $$2 = $$1.c(eug.f);
         if ($$2 != null) {
            aqt $$3 = $$1.d();
            ir $$4 = $$3.a(this.h, ir.a($$2), this.k, this.l);
            if ($$4 != null) {
               cuh $$5 = cuq.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cuq.a($$3, $$5);
               eqt.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static esu.a c() {
      return new esu.a();
   }

   public static class a extends eta.a<esu.a> {
      private awt<ejt> a;
      private ja<eqo> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = esu.a;
         this.b = esu.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected esu.a a() {
         return this;
      }

      public esu.a a(awt<ejt> $$0) {
         this.a = $$0;
         return this;
      }

      public esu.a a(ja<eqo> $$0) {
         this.b = $$0;
         return this;
      }

      public esu.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public esu.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public esu.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public etb b() {
         return new esu(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
