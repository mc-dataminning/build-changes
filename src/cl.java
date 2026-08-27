import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cl extends df<cl.a> {
   @Override
   public Codec<cl.a> a() {
      return cl.a.a;
   }

   public void a(aqo $$0, Collection<brw> $$1) {
      List<eph> $$2 = Lists.newArrayList();
      Set<bsc<?>> $$3 = Sets.newHashSet();

      for (brw $$4 : $$1) {
         $$3.add($$4.ak());
         $$2.add(br.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static record a(Optional<bc> b, List<bc> c, ct.d d) implements df.a {
      public static final Codec<cl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(cl.a::a),
                  br.b.listOf().optionalFieldOf("victims", List.of()).forGetter(cl.a::b),
                  ct.d.d.optionalFieldOf("unique_entity_types", ct.d.c).forGetter(cl.a::c)
               )
               .apply($$0, cl.a::new)
      );

      public static an<cl.a> a(br.a... $$0) {
         return am.H.a(new cl.a(Optional.empty(), br.a($$0), ct.d.c));
      }

      public static an<cl.a> a(ct.d $$0) {
         return am.H.a(new cl.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<eph> $$0, int $$1) {
         if (!this.c.isEmpty()) {
            List<eph> $$2 = Lists.newArrayList($$0);

            for (bc $$3 : this.c) {
               boolean $$4 = false;
               Iterator<eph> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  eph $$6 = $$5.next();
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
      public void a(bd $$0) {
         df.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public List<bc> b() {
         return this.c;
      }

      public ct.d c() {
         return this.d;
      }
   }
}
