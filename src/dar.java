import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dar implements czz {
   final das a;
   final cvx b;
   final String c;
   final czx d;
   final boolean e;
   @Nullable
   private dai f;

   public dar(String $$0, czx $$1, das $$2, cvx $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public dar(String $$0, czx $$1, das $$2, cvx $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dao<?> ar_() {
      return dao.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public czx d() {
      return this.d;
   }

   @Override
   public cvx a(jr.a $$0) {
      return this.b;
   }

   @VisibleForTesting
   public List<Optional<daf>> i() {
      return this.a.c();
   }

   @Override
   public dai a() {
      if (this.f == null) {
         this.f = dai.a(this.a.c());
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

   public boolean a(czy $$0, dev $$1) {
      return this.a.a($$0);
   }

   public cvx a(czy $$0, jr.a $$1) {
      return this.a($$1).v();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   public static class a implements dao<dar> {
      public static final MapCodec<dar> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  czx.e.fieldOf("category").orElse(czx.d).forGetter($$0x -> $$0x.d),
                  das.b.forGetter($$0x -> $$0x.a),
                  cvx.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dar::new)
      );
      public static final zf<ws, dar> x = zf.a(dar.a::a, dar.a::a);

      @Override
      public MapCodec<dar> a() {
         return w;
      }

      @Override
      public zf<ws, dar> b() {
         return x;
      }

      private static dar a(ws $$0) {
         String $$1 = $$0.p();
         czx $$2 = $$0.b(czx.class);
         das $$3 = das.c.decode($$0);
         cvx $$4 = cvx.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dar($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(ws $$0, dar $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         das.c.encode($$0, $$1.a);
         cvx.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
