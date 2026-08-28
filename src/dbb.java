import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbb implements daj {
   final dbc a;
   final cwf b;
   final String c;
   final dah d;
   final boolean e;
   @Nullable
   private das f;

   public dbb(String $$0, dah $$1, dbc $$2, cwf $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public dbb(String $$0, dah $$1, dbc $$2, cwf $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public day<?> aq_() {
      return day.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public dah d() {
      return this.d;
   }

   @Override
   public cwf a(js.a $$0) {
      return this.b;
   }

   @VisibleForTesting
   public List<Optional<dap>> i() {
      return this.a.c();
   }

   @Override
   public das a() {
      if (this.f == null) {
         this.f = das.a(this.a.c());
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

   public boolean a(dai $$0, dff $$1) {
      return this.a.a($$0);
   }

   public cwf a(dai $$0, js.a $$1) {
      return this.a($$1).v();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   public static class a implements day<dbb> {
      public static final MapCodec<dbb> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dah.e.fieldOf("category").orElse(dah.d).forGetter($$0x -> $$0x.d),
                  dbc.b.forGetter($$0x -> $$0x.a),
                  cwf.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dbb::new)
      );
      public static final zj<ww, dbb> x = zj.a(dbb.a::a, dbb.a::a);

      @Override
      public MapCodec<dbb> a() {
         return w;
      }

      @Override
      public zj<ww, dbb> b() {
         return x;
      }

      private static dbb a(ww $$0) {
         String $$1 = $$0.p();
         dah $$2 = $$0.b(dah.class);
         dbc $$3 = dbc.c.decode($$0);
         cwf $$4 = cwf.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dbb($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(ww $$0, dbb $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         dbc.c.encode($$0, $$1.a);
         cwf.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
