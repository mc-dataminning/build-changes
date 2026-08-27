import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dzu(List<dzj> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ahg c = new ahg("jigsaw");
   private static final Map<ahg, ahg> d = ImmutableMap.builder()
      .put(new ahg("nvi"), c)
      .put(new ahg("pcp"), c)
      .put(new ahg("bastionremnant"), c)
      .put(new ahg("runtime"), c)
      .build();

   public dzu(List<dzj> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(hx $$0) {
      for (dzj $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public tk a(dzv $$0) {
      st $$1 = new st();

      for (dzj $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dzu a(st $$0, dzv $$1) {
      List<dzj> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         sn $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ahg $$6 = new ahg($$5);
         ahg $$7 = d.getOrDefault($$6, $$6);
         dzw $$8 = kd.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dzj $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dzu($$2);
   }

   public dyx b() {
      return dzj.a(this.a.stream());
   }

   public List<dzj> c() {
      return this.a;
   }
}
