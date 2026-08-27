import com.google.gson.GsonBuilder;

public class dzh {
   public static GsonBuilder a() {
      return new GsonBuilder()
         .registerTypeAdapter(dzj.class, new dzj.c())
         .registerTypeHierarchyAdapter(edf.class, edg.a())
         .registerTypeHierarchyAdapter(eck.class, ecm.a())
         .registerTypeHierarchyAdapter(edn.class, edo.a())
         .registerTypeHierarchyAdapter(dzk.b.class, new dzk.b.a());
   }

   public static GsonBuilder b() {
      return a()
         .registerTypeHierarchyAdapter(eaf.class, ead.a())
         .registerTypeHierarchyAdapter(eaz.class, ebb.a())
         .registerTypeHierarchyAdapter(ecy.class, ecz.a());
   }

   public static GsonBuilder c() {
      return b().registerTypeAdapter(dzr.class, new dzr.b()).registerTypeAdapter(dzs.class, new dzs.b());
   }
}
