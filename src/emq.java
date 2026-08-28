import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record emq(List<emf> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final all c = all.b("jigsaw");
   private static final Map<all, all> d = ImmutableMap.builder()
      .put(all.b("nvi"), c)
      .put(all.b("pcp"), c)
      .put(all.b("bastionremnant"), c)
      .put(all.b("runtime"), c)
      .build();

   public emq(final List<emf> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jh $$0) {
      for (emf $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vk a(emr $$0) {
      ut $$1 = new ut();

      for (emf $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static emq a(ut $$0, emr $$1) {
      List<emf> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         un $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         all $$6 = all.a($$5);
         all $$7 = d.getOrDefault($$6, $$6);
         ems $$8 = lz.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               emf $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new emq($$2);
   }

   public elt b() {
      return emf.a(this.a.stream());
   }

   public List<emf> c() {
      return this.a;
   }
}
