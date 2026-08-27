import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emo extends emg {
   public static final Codec<emo> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ki.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ell.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, emo::new)
   );
   private final il<dki<?>> b;
   private final List<eln> c;

   emo(List<ent> $$0, il<dki<?>> $$1, List<eln> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public emi b() {
      return emj.p;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         iu<cqk> $$2 = iu.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(elc.a($$1.d(), $$2::add), $$1)));
         ta $$3 = new ta();
         bmw.a($$3, $$2);
         ta $$4 = cof.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cof.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(eld $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static emo.a a(dki<?> $$0) {
      return new emo.a($$0);
   }

   public static class a extends emg.a<emo.a> {
      private final Builder<eln> a = ImmutableList.builder();
      private final dki<?> b;

      public a(dki<?> $$0) {
         this.b = $$0;
      }

      protected emo.a a() {
         return this;
      }

      public emo.a a(eln.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public emh b() {
         return new emo(this.g(), this.b.a(), this.a.build());
      }
   }
}
