import com.google.common.collect.ImmutableMap;

public class exl {
   public static final ext a = new ext(0, ext.a.a, ext.b.a, 3);
   public static final ext b = new ext(0, ext.a.b, ext.b.c, 4);
   public static final ext c = new ext(0, ext.a.a, ext.b.d, 2);
   public static final ext d = new ext(1, ext.a.e, ext.b.d, 2);
   public static final ext e = new ext(2, ext.a.e, ext.b.d, 2);
   public static final ext f = new ext(0, ext.a.c, ext.b.b, 3);
   public static final ext g = new ext(0, ext.a.c, ext.b.e, 1);
   public static final ext h = c;
   public static final exs i = new exs(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final exs j = new exs(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final exs k = new exs(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final exs l = new exs(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final exs m = new exs(ImmutableMap.builder().put("Position", a).build());
   public static final exs n = new exs(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final exs o = new exs(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final exs p = new exs(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final exs q = new exs(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final exs r = new exs(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final exs s = new exs(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final exs t = new exs(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final exs u = new exs(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final exs v = new exs(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
