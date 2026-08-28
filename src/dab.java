import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dab implements czj {
   final dac a;
   final cvl b;
   final String c;
   final czh d;
   final boolean e;
   @Nullable
   private czs f;

   public dab(String $$0, czh $$1, dac $$2, cvl $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public dab(String $$0, czh $$1, dac $$2, cvl $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public czy<?> as_() {
      return czy.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public czh d() {
      return this.d;
   }

   @Override
   public cvl a(jp.a $$0) {
      return this.b;
   }

   @VisibleForTesting
   public List<Optional<czp>> i() {
      return this.a.c();
   }

   @Override
   public czs a() {
      if (this.f == null) {
         this.f = czs.a(this.a.c());
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

   public boolean a(czi $$0, dds $$1) {
      return this.a.a($$0);
   }

   public cvl a(czi $$0, jp.a $$1) {
      return this.a($$1).u();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   public static class a implements czy<dab> {
      public static final MapCodec<dab> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  czh.e.fieldOf("category").orElse(czh.d).forGetter($$0x -> $$0x.d),
                  dac.b.forGetter($$0x -> $$0x.a),
                  cvl.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dab::new)
      );
      public static final zb<wo, dab> x = zb.a(dab.a::a, dab.a::a);

      @Override
      public MapCodec<dab> a() {
         return w;
      }

      @Override
      public zb<wo, dab> b() {
         return x;
      }

      private static dab a(wo $$0) {
         String $$1 = $$0.p();
         czh $$2 = $$0.b(czh.class);
         dac $$3 = dac.c.decode($$0);
         cvl $$4 = cvl.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dab($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wo $$0, dab $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         dac.c.encode($$0, $$1.a);
         cvl.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
