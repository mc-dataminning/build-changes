import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dbu(List<dbu.a> e) implements day, dbx {
   public static final dbu a = new dbu(List.of());
   public static final int b = 160;
   public static final Codec<dbu> c = dbu.a.a.listOf().xmap(dbu::new, dbu::a);
   public static final yu<wh, dbu> d = dbu.a.b.a(ys.a()).a(dbu::new, dbu::a);

   public dbu a(dbu.a $$0) {
      return new dbu(af.a(this.e, $$0));
   }

   @Override
   public void a(dip $$0, bwz $$1, cys $$2, dax $$3) {
      for (dbu.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      if ($$2.b()) {
         List<bve> $$4 = new ArrayList<>();

         for (dbu.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         dao.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<dbu.a> a() {
      return this.e;
   }

   public static record a(je<bvc> c, int d) {
      public static final Codec<dbu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvc.a.fieldOf("id").forGetter(dbu.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dbu.a::c))
               .apply($$0, dbu.a::new)
      );
      public static final yu<wh, dbu.a> b = yu.a(bvc.b, dbu.a::b, ys.h, dbu.a::c, dbu.a::new);

      public bve a() {
         return new bve(this.c, this.d);
      }

      public je<bvc> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
