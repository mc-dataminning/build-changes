import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eru extends esb {
   public static final awk<eiq> a = awg.l;
   public static final jj<epl> b = epm.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<eru> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awk.a(lr.aQ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  epl.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eru::new)
   );
   private final awk<eiq> h;
   private final jj<epl> i;
   private final byte j;
   private final int k;
   private final boolean l;

   eru(List<etz> $$0, awk<eiq> $$1, jj<epl> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public esd<eru> b() {
      return ese.q;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.f);
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if (!$$0.a(cud.uj)) {
         return $$0;
      } else {
         evz $$2 = $$1.c(etk.f);
         if ($$2 != null) {
            aqk $$3 = $$1.d();
            ja $$4 = $$3.a(this.h, ja.a($$2), this.k, this.l);
            if ($$4 != null) {
               cua $$5 = cui.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cui.a($$3, $$5);
               epq.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eru.a c() {
      return new eru.a();
   }

   public static class a extends esb.a<eru.a> {
      private awk<eiq> a;
      private jj<epl> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eru.a;
         this.b = eru.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eru.a a() {
         return this;
      }

      public eru.a a(awk<eiq> $$0) {
         this.a = $$0;
         return this;
      }

      public eru.a a(jj<epl> $$0) {
         this.b = $$0;
         return this;
      }

      public eru.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eru.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eru.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public esc b() {
         return new eru(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
