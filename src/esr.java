import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esr extends esy {
   public static final awt<ejm> a = awp.l;
   public static final jm<eqi> b = eqj.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<esr> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awt.a(lu.aR).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eqi.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, esr::new)
   );
   private final awt<ejm> h;
   private final jm<eqi> i;
   private final byte j;
   private final int k;
   private final boolean l;

   esr(List<euw> $$0, awt<ejm> $$1, jm<eqi> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eta<esr> b() {
      return etb.q;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.f);
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if (!$$0.a(cur.uj)) {
         return $$0;
      } else {
         eww $$2 = $$1.c(euh.f);
         if ($$2 != null) {
            aqt $$3 = $$1.d();
            jd $$4 = $$3.a(this.h, jd.a((jw)$$2), this.k, this.l);
            if ($$4 != null) {
               cuo $$5 = cva.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cva.a($$3, $$5);
               eqn.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static esr.a c() {
      return new esr.a();
   }

   public static class a extends esy.a<esr.a> {
      private awt<ejm> a;
      private jm<eqi> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = esr.a;
         this.b = esr.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected esr.a a() {
         return this;
      }

      public esr.a a(awt<ejm> $$0) {
         this.a = $$0;
         return this;
      }

      public esr.a a(jm<eqi> $$0) {
         this.b = $$0;
         return this;
      }

      public esr.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public esr.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public esr.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public esz b() {
         return new esr(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
