import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dax implements daf {
   final day a;
   final cwb b;
   final String c;
   final dad d;
   final boolean e;
   @Nullable
   private dao f;

   public dax(String $$0, dad $$1, day $$2, cwb $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public dax(String $$0, dad $$1, day $$2, cwb $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dau<?> aq_() {
      return dau.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public dad d() {
      return this.d;
   }

   @Override
   public cwb a(js.a $$0) {
      return this.b;
   }

   @VisibleForTesting
   public List<Optional<dal>> i() {
      return this.a.c();
   }

   @Override
   public dao a() {
      if (this.f == null) {
         this.f = dao.a(this.a.c());
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

   public boolean a(dae $$0, dfb $$1) {
      return this.a.a($$0);
   }

   public cwb a(dae $$0, js.a $$1) {
      return this.a($$1).v();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   public static class a implements dau<dax> {
      public static final MapCodec<dax> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dad.e.fieldOf("category").orElse(dad.d).forGetter($$0x -> $$0x.d),
                  day.b.forGetter($$0x -> $$0x.a),
                  cwb.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dax::new)
      );
      public static final zg<wt, dax> x = zg.a(dax.a::a, dax.a::a);

      @Override
      public MapCodec<dax> a() {
         return w;
      }

      @Override
      public zg<wt, dax> b() {
         return x;
      }

      private static dax a(wt $$0) {
         String $$1 = $$0.p();
         dad $$2 = $$0.b(dad.class);
         day $$3 = day.c.decode($$0);
         cwb $$4 = cwb.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dax($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wt $$0, dax $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         day.c.encode($$0, $$1.a);
         cwb.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
