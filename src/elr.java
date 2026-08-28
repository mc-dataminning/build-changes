import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record elr(List<elg> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alc c = alc.b("jigsaw");
   private static final Map<alc, alc> d = ImmutableMap.builder()
      .put(alc.b("nvi"), c)
      .put(alc.b("pcp"), c)
      .put(alc.b("bastionremnant"), c)
      .put(alc.b("runtime"), c)
      .build();

   public elr(final List<elg> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(je $$0) {
      for (elg $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vc a(els $$0) {
      ul $$1 = new ul();

      for (elg $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static elr a(ul $$0, els $$1) {
      List<elg> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         uf $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alc $$6 = alc.a($$5);
         alc $$7 = d.getOrDefault($$6, $$6);
         elt $$8 = lu.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               elg $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new elr($$2);
   }

   public eku b() {
      return elg.a(this.a.stream());
   }

   public List<elg> c() {
      return this.a;
   }
}
