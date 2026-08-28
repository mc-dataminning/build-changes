import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esc extends esj {
   public static final awm<eix> a = awi.l;
   public static final jj<ept> b = epu.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<esc> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awm.a(lr.aQ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  ept.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, esc::new)
   );
   private final awm<eix> h;
   private final jj<ept> i;
   private final byte j;
   private final int k;
   private final boolean l;

   esc(List<euh> $$0, awm<eix> $$1, jj<ept> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public esl<esc> b() {
      return esm.q;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.f);
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if (!$$0.a(cug.uj)) {
         return $$0;
      } else {
         ewh $$2 = $$1.c(ets.f);
         if ($$2 != null) {
            aqm $$3 = $$1.d();
            ja $$4 = $$3.a(this.h, ja.a($$2), this.k, this.l);
            if ($$4 != null) {
               cud $$5 = cul.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cul.a($$3, $$5);
               epy.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static esc.a c() {
      return new esc.a();
   }

   public static class a extends esj.a<esc.a> {
      private awm<eix> a;
      private jj<ept> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = esc.a;
         this.b = esc.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected esc.a a() {
         return this;
      }

      public esc.a a(awm<eix> $$0) {
         this.a = $$0;
         return this;
      }

      public esc.a a(jj<ept> $$0) {
         this.b = $$0;
         return this;
      }

      public esc.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public esc.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public esc.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public esk b() {
         return new esc(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
