import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class dd extends dh<dd.d> {
   static final Codec<dd.a> a = azg.a(dd.e::values).dispatch(dd.a::a, dd.e::a);

   @Override
   public Codec<dd.d> a() {
      return dd.d.a;
   }

   public void a(aqu $$0, cuh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public interface a extends Predicate<cuh> {
      dd.e a();
   }

   static record b(ci b, int c) implements dd.a {
      public static final Codec<dd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ci.a.fieldOf("item_predicate").forGetter(dd.b::b), Codec.INT.fieldOf("min_lubrication").forGetter(dd.b::c)).apply($$0, dd.b::new)
      );

      @Override
      public dd.e a() {
         return dd.e.b;
      }

      public boolean a(cuh $$0) {
         if (this.b.a($$0)) {
            dri $$1 = $$0.a(ke.am);
            if ($$1 != null) {
               return $$1.b() >= this.c;
            }
         }

         return false;
      }
   }

   static record c(ci b) implements dd.a {
      public static final Codec<dd.c> a = RecordCodecBuilder.create($$0 -> $$0.group(ci.a.fieldOf("item_predicate").forGetter(dd.c::b)).apply($$0, dd.c::new));

      @Override
      public dd.e a() {
         return dd.e.a;
      }

      public boolean a(cuh $$0) {
         return this.b.a($$0);
      }
   }

   public static record d(Optional<bd> b, dd.a c) implements dh.a {
      public static final Codec<dd.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dd.d::a), dd.a.fieldOf("result_predicate").forGetter(dd.d::b)).apply($$0, dd.d::new)
      );

      public static ao<dd.d> a(cuc $$0) {
         return an.aj.a(new dd.d(Optional.empty(), new dd.c(ci.a.a().a($$0).b())));
      }

      public static ao<dd.d> a(int $$0) {
         return an.aj.a(new dd.d(Optional.empty(), new dd.b(ci.a.a().b(), $$0)));
      }

      public static ao<dd.d> a(ci $$0, int $$1) {
         return an.aj.a(new dd.d(Optional.empty(), new dd.b($$0, $$1)));
      }

      public boolean a(cuh $$0) {
         return this.c.test($$0);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public dd.a b() {
         return this.c;
      }
   }

   static enum e implements azg {
      a("standard", () -> dd.c.a),
      b("lubrication", () -> dd.b.a);

      private final String c;
      private final Supplier<Codec<? extends dd.a>> d;

      private e(String $$0, Supplier<Codec<? extends dd.a>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends dd.a> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
