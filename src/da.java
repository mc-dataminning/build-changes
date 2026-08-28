import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class da extends dx<da.a> {
   @Override
   public Codec<da.a> a() {
      return da.a.a;
   }

   public void a(arn $$0, Collection<btz> $$1) {
      List<etw> $$2 = Lists.newArrayList();
      Set<bug<?>> $$3 = Sets.newHashSet();

      for (btz $$4 : $$1) {
         $$3.add($$4.aq());
         $$2.add(bv.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static record a(Optional<bg> b, List<bg> c, di.d d) implements dx.a {
      public static final Codec<da.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(da.a::a),
                  bv.b.listOf().optionalFieldOf("victims", List.of()).forGetter(da.a::b),
                  di.d.d.optionalFieldOf("unique_entity_types", di.d.c).forGetter(da.a::c)
               )
               .apply($$0, da.a::new)
      );

      public static ao<da.a> a(bv.a... $$0) {
         return an.H.a(new da.a(Optional.empty(), bv.a($$0), di.d.c));
      }

      public static ao<da.a> a(di.d $$0) {
         return an.H.a(new da.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<etw> $$0, int $$1) {
         if (!this.c.isEmpty()) {
            List<etw> $$2 = Lists.newArrayList($$0);

            for (bg $$3 : this.c) {
               boolean $$4 = false;
               Iterator<etw> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  etw $$6 = $$5.next();
                  if ($$3.a($$6)) {
                     $$5.remove();
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  return false;
               }
            }
         }

         return this.d.d($$1);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public List<bg> b() {
         return this.c;
      }

      public di.d c() {
         return this.d;
      }
   }
}
