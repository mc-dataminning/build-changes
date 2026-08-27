import com.google.gson.GsonBuilder;

public class ece {
   public static GsonBuilder a() {
      return new GsonBuilder()
         .registerTypeAdapter(ecg.class, new ecg.c())
         .registerTypeHierarchyAdapter(egc.class, egd.a())
         .registerTypeHierarchyAdapter(efh.class, efj.a())
         .registerTypeHierarchyAdapter(egk.class, egl.a())
         .registerTypeHierarchyAdapter(ech.b.class, new ech.b.a());
   }

   public static GsonBuilder b() {
      return a()
         .registerTypeHierarchyAdapter(edc.class, eda.a())
         .registerTypeHierarchyAdapter(edw.class, edy.a())
         .registerTypeHierarchyAdapter(efv.class, efw.a());
   }

   public static GsonBuilder c() {
      return b().registerTypeAdapter(eco.class, new eco.b()).registerTypeAdapter(ecp.class, new ecp.b());
   }
}
