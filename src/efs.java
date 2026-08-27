import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class efs extends efx {
   public static final arr<dwv> a = arn.l;
   public static final edn.a b = edn.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<efs> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asq.a(arr.a(jz.aB), "destination", a).forGetter($$0x -> $$0x.h),
                  edn.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  asq.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  asq.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  asq.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, efs::new)
   );
   private final arr<dwv> h;
   private final edn.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   efs(List<ehk> $$0, arr<dwv> $$1, edn.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public efz b() {
      return ega.m;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.f);
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      if (!$$0.a(cle.tq)) {
         return $$0;
      } else {
         eji $$2 = $$1.c(egw.f);
         if ($$2 != null) {
            ama $$3 = $$1.d();
            ht $$4 = $$3.a(this.h, ht.a($$2), this.k, this.l);
            if ($$4 != null) {
               clb $$5 = cli.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cli.a($$3, $$5);
               edq.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static efs.a c() {
      return new efs.a();
   }

   public static class a extends efx.a<efs.a> {
      private arr<dwv> a;
      private edn.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = efs.a;
         this.b = efs.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected efs.a a() {
         return this;
      }

      public efs.a a(arr<dwv> $$0) {
         this.a = $$0;
         return this;
      }

      public efs.a a(edn.a $$0) {
         this.b = $$0;
         return this;
      }

      public efs.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public efs.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public efs.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public efy b() {
         return new efs(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
