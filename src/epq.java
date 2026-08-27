import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epq extends epw {
   public static final awg<egp> a = awc.l;
   public static final iw<enk> b = enl.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<epq> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axh.a(awg.a(le.aJ), "destination", a).forGetter($$0x -> $$0x.h),
                  enk.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  axh.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  axh.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  axh.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, epq::new)
   );
   private final awg<egp> h;
   private final iw<enk> i;
   private final byte j;
   private final int k;
   private final boolean l;

   epq(List<erq> $$0, awg<egp> $$1, iw<enk> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public epy b() {
      return epz.p;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.f);
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      if (!$$0.a(ctc.uj)) {
         return $$0;
      } else {
         etp $$2 = $$1.c(erc.f);
         if ($$2 != null) {
            aqh $$3 = $$1.d();
            in $$4 = $$3.a(this.h, in.a($$2), this.k, this.l);
            if ($$4 != null) {
               csz $$5 = cth.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cth.a($$3, $$5);
               enp.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static epq.a c() {
      return new epq.a();
   }

   public static class a extends epw.a<epq.a> {
      private awg<egp> a;
      private iw<enk> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = epq.a;
         this.b = epq.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected epq.a a() {
         return this;
      }

      public epq.a a(awg<egp> $$0) {
         this.a = $$0;
         return this;
      }

      public epq.a a(iw<enk> $$0) {
         this.b = $$0;
         return this;
      }

      public epq.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public epq.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public epq.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public epx b() {
         return new epq(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
