import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbi implements daq {
   final dbj a;
   final cwm b;
   final String c;
   final dao d;
   final boolean e;
   @Nullable
   private daz f;

   public dbi(String $$0, dao $$1, dbj $$2, cwm $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public dbi(String $$0, dao $$1, dbj $$2, cwm $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dbf<?> ap_() {
      return dbf.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public dao d() {
      return this.d;
   }

   @Override
   public cwm a(js.a $$0) {
      return this.b;
   }

   @VisibleForTesting
   public List<Optional<daw>> i() {
      return this.a.c();
   }

   @Override
   public daz a() {
      if (this.f == null) {
         this.f = daz.a(this.a.c());
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

   public boolean a(dap $$0, dfm $$1) {
      return this.a.a($$0);
   }

   public cwm a(dap $$0, js.a $$1) {
      return this.a($$1).v();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   public static class a implements dbf<dbi> {
      public static final MapCodec<dbi> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dao.e.fieldOf("category").orElse(dao.d).forGetter($$0x -> $$0x.d),
                  dbj.b.forGetter($$0x -> $$0x.a),
                  cwm.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dbi::new)
      );
      public static final zh<wu, dbi> x = zh.a(dbi.a::a, dbi.a::a);

      @Override
      public MapCodec<dbi> a() {
         return w;
      }

      @Override
      public zh<wu, dbi> b() {
         return x;
      }

      private static dbi a(wu $$0) {
         String $$1 = $$0.p();
         dao $$2 = $$0.b(dao.class);
         dbj $$3 = dbj.c.decode($$0);
         cwm $$4 = cwm.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dbi($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wu $$0, dbi $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         dbj.c.encode($$0, $$1.a);
         cwm.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
