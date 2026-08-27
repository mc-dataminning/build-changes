import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edz extends eee {
   public static final aqj<dvk> a = aqf.l;
   public static final ebv.a b = ebv.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<edz> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arh.a(aqj.a(je.az), "destination", a).forGetter($$0x -> $$0x.h),
                  ebv.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  arh.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  arh.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  arh.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, edz::new)
   );
   private final aqj<dvk> h;
   private final ebv.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   edz(List<efr> $$0, aqj<dvk> $$1, ebv.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eeg b() {
      return eeh.m;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.f);
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      if (!$$0.a(cjk.tp)) {
         return $$0;
      } else {
         ehp $$2 = $$1.c(efd.f);
         if ($$2 != null) {
            aks $$3 = $$1.d();
            gw $$4 = $$3.a(this.h, gw.a($$2), this.k, this.l);
            if ($$4 != null) {
               cjh $$5 = cjo.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cjo.a($$3, $$5);
               eby.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static edz.a c() {
      return new edz.a();
   }

   public static class a extends eee.a<edz.a> {
      private aqj<dvk> a;
      private ebv.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = edz.a;
         this.b = edz.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected edz.a a() {
         return this;
      }

      public edz.a a(aqj<dvk> $$0) {
         this.a = $$0;
         return this;
      }

      public edz.a a(ebv.a $$0) {
         this.b = $$0;
         return this;
      }

      public edz.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public edz.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public edz.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eef b() {
         return new edz(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
