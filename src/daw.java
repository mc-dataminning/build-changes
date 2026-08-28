import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record daw(List<daw.a> e) implements dac, day {
   public static final daw a = new daw(List.of());
   public static final int b = 160;
   public static final Codec<daw> c = daw.a.a.listOf().xmap(daw::new, daw::a);
   public static final yt<wg, daw> d = daw.a.b.a(yr.a()).a(daw::new, daw::a);

   public daw a(daw.a $$0) {
      return new daw(af.a(this.e, $$0));
   }

   @Override
   public void a(dhp $$0, bwr $$1, cxy $$2, dab $$3) {
      for (daw.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      if ($$2.b()) {
         List<buw> $$3 = new ArrayList<>();

         for (daw.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         czu.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<daw.a> a() {
      return this.e;
   }

   public static record a(js<buu> c, int d) {
      public static final Codec<daw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(buu.a.fieldOf("id").forGetter(daw.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(daw.a::c))
               .apply($$0, daw.a::new)
      );
      public static final yt<wg, daw.a> b = yt.a(buu.b, daw.a::b, yr.h, daw.a::c, daw.a::new);

      public buw a() {
         return new buw(this.c, this.d);
      }

      public js<buu> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
