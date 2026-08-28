import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class das implements daa {
   final dat a;
   final cvs b;
   final String c;
   final czy d;
   final boolean e;
   @Nullable
   private daj f;

   public das(String $$0, czy $$1, dat $$2, cvs $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public das(String $$0, czy $$1, dat $$2, cvs $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dap<?> ar_() {
      return dap.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public czy d() {
      return this.d;
   }

   @Override
   public cvs a(jq.a $$0) {
      return this.b;
   }

   @VisibleForTesting
   public List<Optional<dag>> i() {
      return this.a.c();
   }

   @Override
   public daj a() {
      if (this.f == null) {
         this.f = daj.a(this.a.c());
      }

      return this.f;
   }

   @Override
   public boolean h() {
      return this.e;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= this.a.a() && $$1 >= this.a.b();
   }

   public boolean a(czz $$0, dej $$1) {
      return this.a.a($$0);
   }

   public cvs a(czz $$0, jq.a $$1) {
      return this.a($$1).u();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   public static class a implements dap<das> {
      public static final MapCodec<das> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  czy.e.fieldOf("category").orElse(czy.d).forGetter($$0x -> $$0x.d),
                  dat.b.forGetter($$0x -> $$0x.a),
                  cvs.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, das::new)
      );
      public static final zc<wp, das> x = zc.a(das.a::a, das.a::a);

      @Override
      public MapCodec<das> a() {
         return w;
      }

      @Override
      public zc<wp, das> b() {
         return x;
      }

      private static das a(wp $$0) {
         String $$1 = $$0.p();
         czy $$2 = $$0.b(czy.class);
         dat $$3 = dat.c.decode($$0);
         cvs $$4 = cvs.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new das($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wp $$0, das $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         dat.c.encode($$0, $$1.a);
         cvs.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
